package com.n1books.dev;

import com.ibm.watson.developer_cloud.natural_language_classifier.v1.NaturalLanguageClassifier;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classification;

public class NLExample {
public static void main(String[] args) {

NaturalLanguageClassifier service= new NaturalLanguageClassifier();
	service.setUsernameAndPassword("342a5643-499c-472b-9282-0b431e77d6c5","tWB6GfERTola");
	Classification classfication= service.classify("10D41B-nlc-1", "오늘비가올까요?").execute();
	System.out.println(classfication);
}
}
