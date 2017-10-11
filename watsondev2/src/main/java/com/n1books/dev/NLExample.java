package com.n1books.dev;

import com.ibm.watson.developer_cloud.natural_language_classifier.v1.NaturalLanguageClassifier;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classification;

public class NLExample {
public static void main(String[] args) {

NaturalLanguageClassifier service= new NaturalLanguageClassifier();
	service.setUsernameAndPassword("6ea9ae9d-89b6-4450-9707-5afe91f7341c","GkELxJIw0y8S");
	Classification classfication= service.classify("ebd44cx231-nlc-24550", "오늘은 비가 올까요?").execute();
	System.out.println(classfication);
}
}
