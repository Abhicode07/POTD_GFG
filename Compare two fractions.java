class Solution {

    String compareFrac(String str) {
        String numbers[] = str.split("[/,\\s]+");
        double a = (Double.parseDouble(numbers[0])) / (Double.parseDouble(numbers[1]));
        double b = (Double.parseDouble(numbers[2])) / (Double.parseDouble(numbers[3]));
        
        if (a > b){
            return (numbers[0] + "/" + numbers[1]);
        }
        else if (b > a){
            return (numbers[2] + "/" +numbers[3]);
        }
        else{
            return "equal";
        }
    }
}
