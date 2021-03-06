package homework6_state_pattern;

public class StateLessFiveHundred implements State {

	MainWindow mainWindow;
	
	public StateLessFiveHundred(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}
	
	@Override
	public void returnChanges() {
		mainWindow.setState(mainWindow.getStateZero());
		mainWindow.setMsgText("" + mainWindow.getBalance() + "원을 반환합니다");
        mainWindow.setBalance(0);
        mainWindow.setBalanceText();
	}
	
	@Override
	public void selectBeverage() {
		mainWindow.setMsgText("1000원 이상을 넣은 후에 눌러주세요");
	}

	@Override
	public void addHundred() {
		// TODO Auto-generated method stub
		mainWindow.setBalance(mainWindow.getBalance() + 100);
		if(mainWindow.getBalance() == 500)
			mainWindow.setState(mainWindow.getStateFiveHundred());
	}

	@Override
	public void addFiveHundred() {
		// TODO Auto-generated method stub
		mainWindow.setBalance(mainWindow.getBalance() + 500);
		mainWindow.setState(mainWindow.getStateLessOneThousand());
	}

	@Override
	public void addThousand() {
		// TODO Auto-generated method stub
		mainWindow.setBalance(mainWindow.getBalance() + 1000);
		mainWindow.setState(mainWindow.getStateEqualOrMoreOneThousand());
	}
}
