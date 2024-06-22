

class Solution {
    long ExtractNumber(String sentence) {
        // code here
        String[] arr=sentence.split("\\s+");
        long largeNum=-1;
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i].charAt(0)) && !arr[i].contains("9")){
                long currNum=Long.parseLong(arr[i]);
                if(largeNum<currNum){
                    largeNum=currNum;
                }
            }
        }
        return largeNum;
    }
}
