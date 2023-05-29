package mypage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Member implements ActionListener {
    private JTextField id, pw, name, tel;

    public Member(JTextField idField, JTextField pwField, JTextField nField, JTextField tField) {
        this.id = idField;
        this.pw = pwField;
        this.name = nField;
        this.tel = tField;
        
    }

    // 버튼이 클릭됬을 때 txt파일로 저장
    @Override
    public void actionPerformed(ActionEvent e) {
        String idData = id.getText();
        String pwData = pw.getText();
        String nameData = name.getText();
        String telData = tel.getText();
        
        boolean idtest = true;
        try {
            File file = new File("D:\\kdw_Project\\member\\memberList.txt");

            // 파일이 존재하면 해당 파일을 읽어서 이미 존재하는 아이디 또는 계정인지 검사
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String line;
                while ((line = br.readLine()) != null) {
                    // 파일에서 읽어온 아이디와 입력된 아이디가 일치하는 경우
                    if (line.equals(idData)) {
                        JOptionPane.showMessageDialog(null, "이미 존재하는 아이디입니다.");
                        br.close();
                        return;
                    }
                    
                    
                    // 파일에서 읽어온 이름, 전화번호, 나이와 입력된 데이터가 일치하는 경우
//                    if (line.equals(nameData)) {
//                        String telFromFile = br.readLine();
//                        String ageFromFile = br.readLine();
//                       
//                        if (telFromFile.equals(telData) && ageFromFile.equals(ageData)) {
//                        	
//                            
//                            br.close();
//                            return;
//                        }
//                        JOptionPane.showMessageDialog(null, "이미 존재하는 계정입니다.");
//                        idtest=false;
//                        break;
//                    }
                }

                br.close();
            }
            if(idtest) {
            	// 파일이 존재하지 않거나, 파일에 존재하지 않는 아이디인 경우 데이터를 파일에 추가
                FileWriter fw = new FileWriter(file, true);
                fw.write(idData + "\n");
                fw.write(pwData + "\n");
                fw.write(nameData + "\n");
                fw.write(telData + "\n");
                fw.close();
                JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
            }
            
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}