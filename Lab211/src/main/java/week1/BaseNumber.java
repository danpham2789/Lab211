package week1;

public class BaseNumber {
    
    private int fromBase;
    private int toBase;
    private String input;

    public BaseNumber(int fromBase, int toBase, String input) {
        this.fromBase = fromBase;
        this.toBase = toBase;
        this.input = input;
    }
    
    void solve(){
        switch(fromBase){
            case 1:
                switch(toBase){
                    case 2:
                        System.out.println(binToDec());
                        break;
                    case 3:
                        System.out.println(binToHex());
                        break;
                }
                break;
            case 2:
                switch(toBase){
                    case 1:
                        System.out.println(decToBin());
                        break;
                    case 3:
                        System.out.println(decToHex());
                        break;
                }
                break;
            case 3:
                switch(toBase){
                    case 1:
                        System.out.println(hexToBin());
                        break;
                    case 2:
                        System.out.println(hexToDec());
                        break;
                }
        }
    }
    
    int binToDec(){
        int base = 1; 
        int result = 0;
        for (int i = input.length() - 1; i >= 0; i--){
            if (input.charAt(i) == '1') result += base;
            base *= 2;
        }
        return result;
    }
    
    String decToBin(){
        int dec = Integer.parseInt(input);
        
        if (dec == 0) return "0";

        StringBuilder result = new StringBuilder();
        while (dec != 0) {
            result.insert(0 , Integer.toString(dec%2));
            dec /= 2;
        }
        //result.reverse();
        return result.toString();
    }
    
    String decToHex(){
        final char[] HEXDIGITS = { 
            '0', '1', '2', '3', '4', '5', '6', '7', 
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };
        int dec = Integer.parseInt(input);
        if (dec == 0) return "0";
        
        StringBuilder result = new StringBuilder();
        
        while (dec != 0) {
            result.insert(0 , HEXDIGITS[dec%16]);
            dec /= 16;
        }
        return result.toString();
    }
    
    int hexToDec(){
        int base = 1;
        int result = 0;
        for (int i = input.length() - 1; i >= 0; i--){
            char c = input.charAt(i);
            if (c >= '0' && c <= '9')
                result += base * (int)(c - '0');
            else 
                result += base * (int)(c - 'A' + 10);
            base *= 16;
        }
        return result;
    }
    
    String hexToBin(){
        input = Integer.toString(hexToDec());
        return decToBin();
    }
    
    String binToHex(){
        input = Integer.toString(binToDec());
        return decToHex();
    }
}
