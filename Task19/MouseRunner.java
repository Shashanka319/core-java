class MouseRunner{
	public static void main(String[] args){
		MouseLogo mouseLogo = new MouseLogo();
		MouseType mouseType = new MouseType();
		MouseColor mouseColor = new MouseColor();
		MouseButton mouseButton = new MouseButton();
		MouseModel mouseModel = new MouseModel();
		Mouse mouse = new Mouse(500,1,true,6,true,mouseModel,mouseButton,mouseColor,mouseType,mouseLogo);

		}
}