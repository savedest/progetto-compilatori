package nodi;

import Visitor.Env;
import Visitor.Visitatore;

import java.util.ArrayList;

public class LetInstrNode extends Node{
    public String nomeNodo;
    public ArrayList<VarDecl> listaVar;
    public ArrayList<Stat> listaStat;

    public String typeNode;
    public String tipoRitorno;

    public Env currentEnv;

    public String idfor;

    public LetInstrNode(String nomeNodo, ArrayList<VarDecl> listaVar, ArrayList<Stat> listaStat){
        this.nomeNodo = nomeNodo;
        this.listaVar = listaVar;
        this.listaStat = listaStat;

    }



    public Object accept(Visitatore v) {
        return v.visit(this);
    }
//    public Object accept(Visitatore v,ArrayList<ParDecl> pardecls) {
//        return v.visit(this, pardecls);
//    }


}
