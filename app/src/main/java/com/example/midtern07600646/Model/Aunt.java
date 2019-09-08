package com.example.midtern07600646.Model;

public class Aunt {
        private static final String USER = "aaa";
        private static final String USER2 = "bbb";
        private static final String PASSWORD = "111";
        private static final String PASSWORD2 = "222";
        private String mUSER;
        private String mPassword;

        public Aunt (String user, String password) {
            this.mUSER = user;
            this.mPassword = password;
        }
        public boolean check(){
            if(mUSER.equals(USER)||mUSER.equals(USER2)&&mPassword.equals(PASSWORD)||mPassword.equals(PASSWORD2)){
                return true;
            }
            else{
                return false;
            }
        }
    }

