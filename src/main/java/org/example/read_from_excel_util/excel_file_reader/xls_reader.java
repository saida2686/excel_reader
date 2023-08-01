package org.example.read_from_excel_util.excel_file_reader;
import org.example.read_from_excel_util.excel_util;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class xls_reader {
@Test(dataProvider = "login")
    public void test_login(String email,String password){
    System.out.println(email+password);
}

@DataProvider
    public Object[][] login(){
    excel_util reader=new excel_util("/Users/saida/IdeaProjects/excel_reader/excel_examples.xlsx","Sheet1");

  return login();
}


}
