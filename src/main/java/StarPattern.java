//7.Using 2 for loops, produce the output shown below:
//******
//*****
//****
//***
//**
//*

public class StarPattern {

    void generatePattern(){
        for(int i = 0; i < 6 ; i++){
            for(int j = 6; j > i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
