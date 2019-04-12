package com.sanam_numbertoword_application;

public class Convert {

    private int num;
    private String word;
    private String[] numnames={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
            "Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private String[] tensname={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public Convert (int num) {
        this.num = num;
    }

    public String Words(){
        if (num<20){
            word=(numnames[num]);
        }
        else if ((num/10)<10){
            int first,second;
            first= num/10;
            second= num%10;

            word=(tensname[first]+numnames[second]);

        }
        else if ((num/10)>10){
            int first,second,third;
            String hundreds,tens,ones;
            first=num/100;
            num = num%100;
            second=num/10;
            third=num%10;

            hundreds= numnames[first]+" Hundred ";
            tens= tensname[second];
            ones= numnames[third];
            word=(hundreds+tens+ones);
        }
        return word;
    }
}

