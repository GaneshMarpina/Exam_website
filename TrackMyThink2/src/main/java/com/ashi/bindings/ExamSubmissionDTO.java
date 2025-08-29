package com.ashi.bindings;


import lombok.Data;

import java.util.Map;

@Data
public class ExamSubmissionDTO {
    private Integer examId;
    private Map<Integer, String> answers; // key = question index, value = selected option (A, B, C, D)
	public Integer getExamId() {
		return examId;
	}
	public void setExamId(Integer examId) {
		this.examId = examId;
	}
	public Map<Integer, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
    
    
}
