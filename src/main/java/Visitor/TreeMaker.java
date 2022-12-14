package Visitor;

import nodi.*;

public class TreeMaker implements Visitatore{
public String content;

    @Override
    public String visit(FuncallNode node) {



        return null;
    }
    @Override
    public String visit(ExprNode node) {



        return null;
    }

    public String visit(BoolConst node) {

        if(node.val == true)
            content = "(TRUE)";
        else
            content = "(FALSE)";

        return content;
    }
    public String visit(IntegerConst node){
        content =  "(INTEGER_CONST: "+node.val+")";
        return content;
    }

    /*public String visit(Node node){
        String content;
        content =
        return content;
    }*/

    public String visit(RealConst node){
        String content;
        content = "(REAL_CONST: "+node.val+")";
        return content;
    }

    public String visit(StringConst node){
        String content;
        content = "(STRING_CONST: "+ node.val+")";
        return content;
    }

    public String visit(CharConst node){
        String content;
        content = "(CHAR_CONST: "+ node.val +")";
        return content;
    }
    public String visit(IdVal node){
        String content;
        content = "(ID: "+ node.val + ")";
        return content;
    }
}