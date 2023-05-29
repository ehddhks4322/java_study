package mypage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MemberService implements ActionListener{ 
	
	boolean idCheck = false;
	
    public List<String> getMembers() {
    	
        List<String> members = new ArrayList<String>();
        try {
            File file = new File("D:\\kdw_Project\\member\\memberList.txt");
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String line;

                while ((line = br.readLine()) != null) {
                	
                    String[] memberInfo = new String[4];
                    String[] info = new String[4]; 
                    for(int i=0; i<6; i++) {
                    	info[i] = line.split("/")[i];
                    }
                    
                    memberInfo[0] = info[0]; // id
                    memberInfo[1] = info[1]; // pw
                    memberInfo[2] = info[2]; // name
                    memberInfo[3] = info[3]; // tel
                   
                    
                    if(memberInfo[0].equals(info[0]) && memberInfo[1].equals(info[1])){
                    	idCheck=true;
                    	break;
                    }
                }
               
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return members;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	MemberService memberService = new MemberService();
        List<String> members = memberService.getMembers();
        
    }

        
}
   
