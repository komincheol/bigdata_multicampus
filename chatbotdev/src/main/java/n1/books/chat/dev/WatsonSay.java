package n1.books.chat.dev;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.watson.developer_cloud.conversation.v1.Conversation;
import com.ibm.watson.developer_cloud.conversation.v1.model.Context;
import com.ibm.watson.developer_cloud.conversation.v1.model.InputData;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

@RestController
public class WatsonSay {
	private static Logger logger = LoggerFactory.getLogger(WatsonSay.class);

	@RequestMapping(value = "watsonsay")
	public MessageResponse watsonsay(String isay, HttpSession session) {
		logger.info("user input :" + isay);

		Conversation service = new Conversation(Conversation.VERSION_DATE_2017_05_26);
		service.setUsernameAndPassword("4530d5d1-59a5-4fcc-9d32-5021e141f8d2", "VyEa2brPje04");

		MessageResponse response = null;
		Context context = (Context) session.getAttribute("context");
		MessageOptions options = null;
		String msg = isay;
		StringBuffer watsonSay = null;

		options = new MessageOptions
				.Builder()
				.workspaceId("1074b3ec-6ae4-471a-9f4d-40d021efdad1")
				.input(new InputData.Builder(msg).build())
				.context(context)
				.build();

		response = service.message(options).execute();


		watsonSay = new StringBuffer();
		for (String text : response.getOutput().getText()) {
			watsonSay.append(text);
			watsonSay.append(" ");

		}
		logger.info("watson :"+watsonSay);
		//logger.info("response :"+response);
		context = response.getContext();
		
		session.setAttribute("context", context);
		
		
		double score = (Double) context.get("score");
		System.out.println(score);
		
		return response;

	}
}
