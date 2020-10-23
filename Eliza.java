package elizaTalk;

public class Eliza {

	public static void main(String[] args) {
		
	}
	 public String hanasu(String str1){
	      int k1=0,k2=0;
	    
	      
	      //「こんにちは」が含まれるか判断
	      k1=str1.indexOf("こんにちは");
	      if(k1>=0) return("こんにちは！");
	 
	      //私は○○が好きに対応
	      k1=str1.indexOf("私は");
	      k2=str1.indexOf("が好き");
	      if(k1>=0 && k2>=0){
	        String str2=str1.substring(k1+2,k2); 
	        return("あなたが好きなのは「"+str2+"」なんですね？");
	      }
	 
	      //どんな食べ物が好き？
	      k1=str1.indexOf("食べ物");
	      k2=str1.indexOf("好き");
	      if(k1>=0 && k2>=0){
	        java.util.Date d = new java.util.Date();
	        long t=d.getTime();
	        if(t%3==0)
	          return("Elizaは夏みかんが好き．");
	        else if(t%3==1)
	          return("あなたは，何が好きなの？");
	        else
	          return("今，おなかいっぱい．");
	      }
	      
	      //どんな趣味があるのかな？
	      //私は○○をすることが好きに対応
	      k1=str1.indexOf("私の趣味は");
	      k2=str1.indexOf("です。");
	      if(k1>=0 && k2>=0){
	        String str2=str1.substring(k1+2,k2); 
	        return("あなたの趣味は「"+str2+"」なんですね？\n私は");
	      }
	      
	      return "え，何？";
	   }

}
