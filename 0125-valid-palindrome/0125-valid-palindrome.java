class Solution {
    public boolean isPalindrome(String s) {

       
        if(s.trim().length()==0||s.trim().length()==1){
            return true;
        }


        String str = s.toLowerCase();
        String str1 = "";


        for(char c : str.toCharArray()) {
            if(isValidAlphaNumeric(c)){
                str1= str1+c;
            }
        }
        
        if(str1.length()==0){
            return true;
        }
        int left =0;
        int right =str1.length()-1;

        while(left<right){


            if(str1.charAt(left)!=str1.charAt(right)){
                break;

            }
            left++;
            right--;

        }

        if(left ==right||left-1==right){
            return true;
        }

        return false;

        }


    private static boolean isValidAlphaNumeric(char c) {
        if((c>=97 && c<=122)||(c>=48 && c<=57)){
            return true;
        }

        return false;

    }

        
    }