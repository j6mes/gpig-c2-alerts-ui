package gpig.group2.ui.model;

public class Alert {

	private int id;
	private String text;
	private AlertPriority priority;
	private AlertAction actioned;
	private String actionText;

	public Alert(int id, String text, AlertPriority priority, AlertAction actioned) {
		super();
		this.id = id;
		this.text = text;
		this.priority = priority;
		this.actioned = actioned;
	}

	public String getActionText() {
		return actionText;
	}

	public void setActionText(String actionText) {
		this.actionText = actionText;
	}

	public Alert() {
	}

	public String getText() {
		return text;
	}

	public void setText(String alertText) {
		this.text = alertText;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AlertPriority getPriority() {
		return priority;
	}

	public void setPriority(AlertPriority priority) {
		this.priority = priority;
	}

	public AlertAction getActioned() {
		return actioned;
	}

	public void setActioned(AlertAction actioned) {
		this.actioned = actioned;
	}

	@Override
	public String toString() {
		return "Alert [id=" + id + ", text=" + text + ", priority=" + priority + ", actioned=" + actioned
				+ ", actionText=" + actionText + "]";
	}
}