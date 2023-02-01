package nodi;



import Visitor.Env;
import Visitor.Visitatore;

import java.util.ArrayList;

public   class LetStatNode extends Node{
    public String nomeNodo;
    public ArrayList<VarDecl> listaVar;
    public ArrayList<Stat> listaStat;

    public String typeNode;


    public Env currentEnv;



    public LetStatNode(String nomeNodo, ArrayList<VarDecl> listaVar, ArrayList<Stat> listaStat){
        this.nomeNodo = nomeNodo;
        this.listaVar = listaVar;
        this.listaStat = listaStat;

    }



    public Object accept(Visitatore v) {
        return v.visit(this);
    }


}


