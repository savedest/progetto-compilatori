package nodi;

import Visitor.Visitatore;

import java.util.ArrayList;

public class SwitchNode extends  Node{
    public String nomenodo;
    public IdVal id;
    public ArrayList<CaseNode> caseList;



    public String typeNode;


    public SwitchNode(String nodo, IdVal id, ArrayList<CaseNode> caseList){
        this.nomenodo=nodo;
        this.id = id;
        this.caseList = caseList;

    }
    public Object accept(Visitatore v) {
        return v.visit(this);
    }

}
