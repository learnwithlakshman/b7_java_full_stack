package com.careerit.cj.collection.quiz;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Quiz {
	
		private static List<Question> questions;
		static {
			questions = QuestionReaderUtil.loadQuestions();
		}
		public void startQuiz() throws InterruptedException {
			System.out.println("Your quiz is going to start in few seconds wait....");
			TimeUnit.SECONDS.sleep(2);
			// Iterate question ask him/her enter correct answer
			
			System.out.println("Please wait you results are going to show in few seconds");
			TimeUnit.SECONDS.sleep(2);
			// Finally compute result use showResult method to display result
		
			
		}
		
		public void showResult(int tcount,int ccount,int wcount,float percentage) {
			// Result
			
		}
}
