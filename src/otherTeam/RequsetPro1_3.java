package otherTeam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("serial")
public class RequsetPro1_3 extends Pro1_3{
   ArrayList<HashMap<String, String>> requestList = new ArrayList<>();
   Map<String, Integer> requsetCountKey = new HashMap<String, Integer>();

   public RequsetPro1_3( ArrayList<HashMap<String, String>> requestList ) throws Exception{
      
      this.requestList = requestList;
      calculate();
      output();
      
   } // end Pro1_7
   
   @Override
   public void parseKey(String key) {
      int index = key.indexOf('&');
        if (index == -1) { return; }
        String keyKey = key.substring(0,index);
        if(!requsetCountKey.containsKey(keyKey)){
           requsetCountKey.put(keyKey,1);
        }else{
            int count = requsetCountKey.get(keyKey);
            requsetCountKey.put(keyKey,++count);
        } // end if
   } // parseKey 

   @Override
   public void calculate() {
      for (HashMap<String, String> hm : requestList) {
            parseKey((String) hm.get("key"));
        } // end for
   } // calculate
   private int maxKeyValue;
   private String maxKey; 
   
   
   public int getMaxKeyValue() {
	return maxKeyValue;
}

public String getMaxKey() {
	return maxKey;
}

@Override
   public void output(){

        Set<String> keys = requsetCountKey.keySet();

         maxKeyValue = 0;
         maxKey = "";
        for(String eachKey : keys) {
            int val = requsetCountKey.get(eachKey);
            if( val > maxKeyValue){
                maxKeyValue = val;
                maxKey = eachKey;
            } // end if
        } // end for

   } // output

   
} // class