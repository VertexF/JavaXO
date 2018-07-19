/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guixo;

/**
 *
 * @author Dan
 */

public class Board {
    private String buttonText;
    private int XCount = 0;
    private int OCount = 0;
    
    String buttonText1[];

    public Board()
    {
        buttonText1 = new String[9];
        for(int i = 0; i < 9; i++)
        {
            buttonText1[i] = new String("");
        }
        
        buttonText = new String("X");
    }
    
    public void setButtonText(String text)
    {
        buttonText = text;
    }
    
    public String getButtonText()
    {
        return buttonText;
    }
    
    public int getXScore()
    {
        return XCount;
    }
    
    public int getOScore()
    {
        return OCount;
    }
    
    public void setButton1Text(String text){ buttonText1[0] = text; }
    public void setButton2Text(String text){ buttonText1[1] = text; } 
    public void setButton3Text(String text){ buttonText1[2] = text; } 
    public void setButton4Text(String text){ buttonText1[3] = text; } 
    public void setButton5Text(String text){ buttonText1[4] = text; } 
    public void setButton6Text(String text){ buttonText1[5] = text; } 
    public void setButton7Text(String text){ buttonText1[6] = text; } 
    public void setButton8Text(String text){ buttonText1[7] = text; } 
    public void setButton9Text(String text){ buttonText1[8] = text; } 
    
    public void resetBoard()
    {
        for(int i = 0; i < 9; i++)
        {
            buttonText1[i] = "";
        }
    }
    
    public void chooseAPlayer()
    {
        if(buttonText.equals("X"))
        {
            buttonText = "O";
        }
        else
        {
            buttonText = "X";
        }
    }
    
    public boolean isDraw()
    {
        for(String butText : buttonText1)
        {
            if(butText.equals(""))
            {
                return false;
            }
        }
        
        return true;
    }
    
    public int winningGame()
    {
        /**
         * Return win condition flag: 0 means No winner, 1 means X is the winner, 2 means O is the winner.
         */
        
        if(buttonText1[0].equals("X") && buttonText1[1].equals("X") && buttonText1[2].equals("X"))
        { 
            XCount++;
            return 1;
        }
        
        if(buttonText1[3].equals("X") && buttonText1[4].equals("X") && buttonText1[5].equals("X"))
        {
            XCount++;
            return 1;
        }
                
        if(buttonText1[6].equals("X") && buttonText1[7].equals("X") && buttonText1[8].equals("X"))
        {
            XCount++;
            return 1;
        }
        
        if(buttonText1[0].equals("X") && buttonText1[3].equals("X") && buttonText1[6].equals("X"))
        {
            XCount++;
            return 1;
        }
        
        if(buttonText1[1].equals("X") && buttonText1[4].equals("X") && buttonText1[7].equals("X"))
        {
            XCount++;
            return 1;
        }
        
        if(buttonText1[2].equals("X") && buttonText1[5].equals("X") && buttonText1[8].equals("X"))
        {
            XCount++;
            return 1;
        }
        
        if(buttonText1[0].equals("X") && buttonText1[4].equals("X") && buttonText1[8].equals("X"))
        {
            XCount++;
            return 1;
        }
        
        if(buttonText1[2].equals("X") && buttonText1[4].equals("X") && buttonText1[6].equals("X"))
        {
            XCount++;
            return 1;
        }
        
        /**
         O after this point.
         */
        if(buttonText1[0].equals("O") && buttonText1[1].equals("O") && buttonText1[2].equals("O"))
        {
            OCount++;
            return 2;
        }
        
        if(buttonText1[3].equals("O") && buttonText1[4].equals("O") && buttonText1[5].equals("O"))
        {
            OCount++;
            return 2;
        }
                
        if(buttonText1[6].equals("O") && buttonText1[7].equals("O") && buttonText1[8].equals("O"))
        {
            OCount++;
            return 2;
        }
        
        if(buttonText1[0].equals("O") && buttonText1[3].equals("O") && buttonText1[6].equals("O"))
        {
            OCount++;
            return 2;
        }
        
        if(buttonText1[1].equals("O") && buttonText1[4].equals("O") && buttonText1[7].equals("O"))
        {
            OCount++;
            return 2;
        }
        
        if(buttonText1[2].equals("O") && buttonText1[5].equals("O") && buttonText1[8].equals("O"))
        {
            OCount++;
            return 2;
        }
        
        if(buttonText1[0].equals("O") && buttonText1[4].equals("O") && buttonText1[8].equals("O"))
        {
            OCount++;
            return 2;
        }
        
        if(buttonText1[2].equals("O") && buttonText1[4].equals("O") && buttonText1[6].equals("O"))
        {
            OCount++;
            return 2;
        }
        
        return 0;
    }
}
