
public class libraryDate {
    
    int day[];
    int month[];
    int year[];
    
    libraryDate(){
        this.day = new int[1];
        this.month = new int[1];
        this.year = new int[1];
    }
    
    libraryDate(int a, int b, int c){
        this.day[0] = c;
        this.month[0] = b;
        this.year[0] = a;
    }
    
    static int toDays(int month, int day){
        int z = day;
        
        if(month==2){
            z = day + 31;
        }else if(month==3){
            z = day + 59;
        }else if(month==4){
            z = day + 90;
        }else if(month==5){
            z = day + 120;
        }else if(month==6){
            z = day + 151;
        }else if(month==7){
            z = day + 181;
        }else if(month==8){
            z = day + 212;
        }else if(month==9){
            z = day + 243;
        }else if(month==10){
            z = day + 273;
        }else if(month==11){
            z = day + 304;
        }else if(month==12){
            z = day + 334;
        }
        
        return z;
    }
    
    int getDueYear(){
        int Year = this.year[0];
        int Month = this.month[0];
        int Day = this.day[0];
        
        int x = toDays(Month, Day) + 20;
        if(x>365){
            Year= Year + 1;
        }
        this.year[1] = Year;
        return Year;
    }
    
    int getDueMonth(){
        int Month = this.month[0];
        int Day = this.day[0];
        
        int x = toDays(Month, Day) + 20;
        if(x>365){
            x = x - 365;
        }else if(x>334&&x<365){
            Month = 12;
        }else if(x>304&&x<334){
            Month = 11;
        }else if(x>273&&x<304){
            Month = 10;
        }else if(x>243&&x<273){
            Month = 9;
        }else if(x>212&&x<243){
            Month = 8;
        }else if(x>181&&x<212){
            Month = 7;
        }else if(x>151&&x<181){
            Month = 6;
        }else if(x>120&&x<151){
            Month = 5;
        }else if(x>90&&x<120){
            Month = 4;
        }else if(x>59&&x<90){
            Month = 3;
        }else if(x>31&&x<59){
            Month = 2;
        }else if(x>0&&x<31){
            Month = 1;
        }
        this.month[1] = Month;
        return Month;
    }
    
    int getDueDay(){
        int Month = this.month[0];
        int Day = this.day[0];
        
        int d = 0;
        int x = toDays(Month, Day) + 20;
        
        System.out.println(x);
        
        if(x>365){
            x = x - 365;
        }else if(x>334&&x<365){
            d = x - 334;
        }else if(x>304&&x<334){
            d = x - 304;
        }else if(x>273&&x<304){
            d = x - 273;
        }else if(x>243&&x<273){
            d = x - 243;
        }else if(x>212&&x<243){
            d = x - 212;
        }else if(x>181&&x<212){
            d = x - 181;
        }else if(x>151&&x<181){
            d = x - 151;
        }else if(x>120&&x<151){
            d = x - 120;
        }else if(x>90&&x<120){
            d = x - 90;
        }else if(x>59&&x<90){
            d = x - 59;
        }else if(x>31&&x<59){
            d = x - 31;
        }
        this.day[1] = Day;
        return d;
    }
    
    int getTakenDay(){
        return this.day[0];
    }
    
    int getTakenMonth(){
        return this.month[0];
    }
    
    int getTakenYear(){
        return this.year[0];
    }
    
    int getDaysLate(int rYear, int rMonth, int rDay){
        int y1 = this.year[1];
        int y2 = rYear;
        int Taken = toDays(this.month[1], this.day[1]);
        int Return = toDays(rMonth, rDay);
        
        int x = ((y2-y1)*365) + (Return - Taken);
        
        return x;
    }
    
    String getDueDate(){
        String x = this.year[1] + "-" + this.month [0] + "-" + this.day [0];
        return x;
    }
    
    String getTakenDate(){
        String x = this.year[0] + "-" + this.month[0] + "-" + this.day[0];
        return x;
    }
}
