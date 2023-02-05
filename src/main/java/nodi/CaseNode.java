package nodi;

import Visitor.Visitatore;

import java.util.ArrayList;

public class CaseNode extends Node{

    public IntegerConst val1;
    public ArrayList<Stat> listaStat;
    public String typeNode;

    public CaseNode( IntegerConst val1,ArrayList<Stat> listaStat) {
        this.listaStat = listaStat;
        this.val1=val1;
    }
    public Object accept(Visitatore v) {
        return v.visit(this);
    }
}
