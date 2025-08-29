package com.ashi.entities;

import java.time.LocalDateTime;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student_exam_attempts")
@Getter
@Setter
@ToString
public class StudentExamAttemptEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    @ManyToOne(optional = false)
    @JoinColumn(name = "exam_id", referencedColumnName = "exam_id") //must match the column name in the ExamEntity
    private ExamEntity exam;

    private Double score;

    @Column(name = "attempt_date")
    private LocalDateTime attemptDate;

    @PrePersist
    public void onCreate() {
        attemptDate = LocalDateTime.now();
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}

	public ExamEntity getExam() {
		return exam;
	}

	public void setExam(ExamEntity exam) {
		this.exam = exam;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public LocalDateTime getAttemptDate() {
		return attemptDate;
	}

	public void setAttemptDate(LocalDateTime attemptDate) {
		this.attemptDate = attemptDate;
	}
    
    
}
