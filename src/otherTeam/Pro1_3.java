package otherTeam;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author panos 3. ���񽺸� ���������� ������(200) Ƚ��,����(404) Ƚ��
 *
 *         4. ��û�� ���� ���� �ð� [10��]
 */
@SuppressWarnings("serial")
public class Pro1_3 extends JFrame {
    Map<String, Integer> countKey = null; // 1�� Ű���� ���� ���Դϴ�.
    Map<String, Integer> countBrowser = null; // 2�� ������ ���� Ƚ���� ���� ���Դϴ�.
    Map<String, Integer> countCode = null; // 3,5,6�� ����Ƚ���� ���� ���Դϴ�.
    Map<Integer, Integer> countTime = null; // 4�� ��û�� �� ���Դϴ�.
    ArrayList<HashMap<String, String>> list = new ArrayList<>(); // ��ü �����Ͱ� ����� ����Ʈ�Դϴ�.
    ArrayList<HashMap<String, String>> requestList = new ArrayList<>(); // �Էµ� ������ �����Ͱ� ����� ����Ʈ.
    SimpleDateFormat sidf = null;
    /*
     * �� �������� ���ϰ� �������� ó���߽��ϴ�.
     * �ѹ� ������ ���� �ʱ�ȭ ����߰ڳ׿�
     * */
    private String maxKey; //�ִٻ��Ű�� �̸��� Ƚ��
    private int maxKeyValue;//Ƚ��
    private int maxtime;
    private double error500;
    private double error403;
    private int  maxKeyValue7;
    private String maxKey7;
    
    private  String name;
    
	/**
     * 3, 5, 6�� ������ ���ϴ� �����Դϴ�.
     */
    public void parseKey(String key){
        int index = key.indexOf('&');
        if (index == -1)// key�� ���� ���� �־ �־����ϴ�.
        {
            return;
        }
        String keyKey = key.substring(0,index);
        if(!countKey.containsKey(keyKey)){
            countKey.put(keyKey,1);
        }else{
            int i = countKey.get(keyKey);
            countKey.put(keyKey,++i);
        }
    }


    public void parseBrowser(String browser){
        String browserKey = browser.substring(1);
        if(!countBrowser.containsKey(browserKey)){
            countBrowser.put(browserKey,1);
        }else{
            int i = countBrowser.get(browserKey);
            countBrowser.put(browserKey,++i);
        }//else

    }//parseBrowser

    public void parseCode(String code) {
        String codeKey = code.substring(1);
        if(!countCode.containsKey(codeKey)){
            countCode.put(codeKey,1);
        }else{
            int i = countCode.get(codeKey);
            countCode.put(codeKey,++i);
        }
    }

    /**
     * @throws ParseException 4�� ������ ���ϴ� �����Դϴ�.
     */
    @SuppressWarnings("deprecation")
	public void parseTime(String data) throws ParseException {

        sidf = new SimpleDateFormat("yyyy-MM-dd hh");

        String lowData = data.substring(1);
        Date date = sidf.parse(lowData);
        if (!countTime.containsKey(date.getHours())) {
            countTime.put(date.getHours(), 1);
        } else {
            int i = countTime.get(date.getHours());
            countTime.put(date.getHours(), ++i);
        }//end if
    }
    /**
     * @throws IOException �����Դϴ�. �̹��� �ݿ����Ѱ��� �⺻���� �ؼ� ��������ϴ�. ������ ���� ���Ƿ� ���� �����ϴ�. //���� �����ϵ��� ��������ϴ�.
     */
    public void input() throws IOException {

    	FileDialog fd = new FileDialog(this, "���ϼ���", FileDialog.LOAD);
    	
    	
        fd.setVisible(true);
        
        String path = fd.getDirectory();
        name = fd.getFile();
        System.out.println(name);
        File file = new File(path + name);//���� �����ϴ� dialog �κ� �߰� �߽��ϴ�.
        
        countTime = new HashMap<>();
        countCode = new HashMap<>();
        countKey = new HashMap<>();
        countBrowser = new HashMap<>();
        String[] test2;
        String[] test3;

        if (file.exists()) {
            BufferedReader br = null;// ���ϰ� �����ϴ� �ɷ��� ���� ������ �ٴ����� ������
            try {
                br = new BufferedReader(new FileReader(file));
             
                String data;
                while ((data = br.readLine()) != null) {
                    test2 = data.split("=");
                    test3 = data.split("]");

                    HashMap<String,String> map = new HashMap<>();

                    map.put("code",test3[0]); // "[200"
                    map.put("key",test2[1]); //  "=HTML&query"
                    map.put("browser",test3[2]); // "[ie"
                    map.put("maxtime",test3[3]); // "[2022-02-04 09:35:16

                    list.add(map);
                }//end while
            } finally {
                if (br != null) {
                    br.close();
                }
            }//end finally
        } else {
            System.out.println("���������ʽ��ϴ�");
        }//end else
    }
    public void calculate(){
        for (HashMap<String, String> eachMap : list) {
            parseKey((String) eachMap.get("key"));
            parseBrowser((String) eachMap.get("browser"));
            parseCode((String) eachMap.get("code"));
            try {
                parseTime((String) eachMap.get("maxtime"));
            }
            catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
    

    
	public String getName() {
		return name;
	}


	public double getError500() {
		return error500;
	}


	public double getError403() {
		return error403;
	}


	public int getMaxtime() {
		return maxtime;
	}


	public String getMaxKey() {
		return maxKey;
	}


	public int getMaxKeyValue() {
		return maxKeyValue;
	}


	public int getMaxKeyValue7() {
		return maxKeyValue7;
	}


	public String getMaxKey7() {
		return maxKey7;
	}


	public void setMaxKeyValue7(int maxKeyValue7) {
		this.maxKeyValue7 = maxKeyValue7;
	}


	public void setMaxKey7(String maxKey7) {
		this.maxKey7 = maxKey7;
	}


	public void output(){

        Set<String> keys = countKey.keySet();
        Set<Integer> times = countTime.keySet();
        Set<String> codes = countCode.keySet();

        for(String eachKey : keys) {
            int val = countKey.get(eachKey);
            if( val > maxKeyValue){
                maxKeyValue = val;
                maxKey = eachKey;
            }//if
        }//for

        int maxtimeValue = 0;
        maxtime = 0;
        for(Integer eachTime : times){
            int val = countTime.get(eachTime);
            if(val > maxtimeValue) {
                maxtimeValue = val;
                maxtime = eachTime;
            }//if
        }//for

        int allCode = 0;
        for(String eachcode : codes){
            int val = countCode.get(eachcode);
            allCode += val;
        }
         error403 = ((double)countCode.get("403")/(double) allCode*100);
         error500 = ((double)countCode.get("500")/(double) allCode*100)%.2f;
        
    }
	
    public void request(int firstNum, int lastNum ) throws Exception {
        
        for(int i = firstNum; i < lastNum+1; i++) {
           requestList.add(list.get(i));
        } // end for
        
        RequsetPro1_3 po =new RequsetPro1_3(requestList);
       
        maxKey7=po.getMaxKey();
        maxKeyValue7=po.getMaxKeyValue();
      } // end request

} // class