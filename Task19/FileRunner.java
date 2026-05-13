class FileRunner{
	
	public static void main(String[] args){
		
		HTML html = new HTML("AnchorTags", 4);
		if(html != null){
			.html.getFile();
		}else{
			System.out.println("File is not there..");
		}
		CSS css = new CSS("style.css", "design");
		if(css != null){
			css.getFile();
		}else{
			System.out.println("File is not there..");
		}
		JavaScript javaScript = new JavaScript(5, "script");
		if(javaScript != null){
			javaScript.getFile();
		}else{
			System.out.println("File is not there..");
		}
		Java java = new Java(8, "programming");		
		if(java != null){
			java.getFile();
		}else{
			System.out.println("File is not there..");
		}
		CProgramming cProgramming = new CProgramming("Procedural", 19);
		if(cProgramming != null){
		    cProgramming.getFile();
		}else{
			System.out.println("File is not there..");
		}
	
		File file = new File(20,21,"html",true,2,23, html, css, javaScript, java, cProgramming);
	
	
	}			

}