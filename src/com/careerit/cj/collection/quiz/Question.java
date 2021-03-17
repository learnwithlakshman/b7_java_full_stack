package com.careerit.cj.collection.quiz;

import java.util.List;

public class Question {

		private int num;
		private String questionData;
		private List<String> answers;
		private int correctAnswer;
		
		public Question(int num, String questionData, List<String> answers, int correctAnswer) {
			super();
			this.num = num;
			this.questionData = questionData;
			this.answers = answers;
			this.correctAnswer = correctAnswer;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getQuestionData() {
			return questionData;
		}
		public void setQuestionData(String questionData) {
			this.questionData = questionData;
		}
		public List<String> getAnswers() {
			return answers;
		}
		public void setAnswers(List<String> answers) {
			this.answers = answers;
		}
		public int getCorrectAnswer() {
			return correctAnswer;
		}
		public void setCorrectAnswer(int correctAnswer) {
			this.correctAnswer = correctAnswer;
		}
		
		
}
