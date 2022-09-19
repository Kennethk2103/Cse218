package DataHandling;

import java.util.PriorityQueue;

public class DataManager {
	ApplicantHandleing app;
	EssayHandleing essayHandle;
	PriorityQue que;
	public DataManager(ApplicantHandleing app, EssayHandleing essayHandle,PriorityQue que) {
		super();
		this.app = app;
		this.essayHandle = essayHandle;
		this.que=que;
	}
	public ApplicantHandleing getApp() {
		return app;
	}
	public void setApp(ApplicantHandleing app) {
		this.app = app;
	}
	public EssayHandleing getEssayHandle() {
		return essayHandle;
	}
	public void setEssayHandle(EssayHandleing essayHandle) {
		this.essayHandle = essayHandle;
	}
	public PriorityQue getPriorityQue() {
		return que;
	}
	public void setPriorityQue(PriorityQue que) {
		this.que = que;
	}
	
	
}
