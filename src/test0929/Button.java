package test0929;

public class Button {
	OnClickLinstner listner;
	
	void setOnClickListener(OnClickLinstner listner) {
		this.listner=listner;
	}
	void touch() {
		listner.onClick();
	}
	static interface OnClickLinstner{
		void onClick();
	}
}
