package projeto;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * Classe para manipular a tabela de Hackers - Fonte adaptado a partir do disponibilizado pelo professor
 * @author dalalana
 */
public class PessoasTM extends AbstractTableModel {
    
    private List<Hacker> linhas;
    private String[] colunas = new String[]{"Nome","Nivel","Email"};

    public PessoasTM(){
        linhas = new ArrayList<Hacker>();
        
    }
    public PessoasTM(List<Hacker> lista) {
        this.linhas = new ArrayList<Hacker>(lista);
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        return String.class; // pq todos as colunas da minha tabela sÃ£o String, do contrÃ¡rio posso usar um switch
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Hacker p = linhas.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getNome();
            
            case 1:
                return p.getNivel();
               
            case 2:
                return p.getEmail();
                
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Hacker p = linhas.get(rowIndex); // carrega o item da linha a ser modificado
        switch(columnIndex){
            case 0:
                p.setNome(aValue.toString());
                break;
            
            case 1:
                p.setNivel(aValue.toString());
                break;
               
            case 2:
                p.setEmail(aValue.toString());
                break;
                
            default:
                
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    
    public void setValueAt(Hacker aValue, int rowIndex) {
        Hacker p = linhas.get(rowIndex); // carrega o item da linha a ser modificado
        
        p.setNome(aValue.getNome());
        p.setNivel(aValue.getNivel());
        p.setEmail(aValue.getEmail());
       
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    public Pessoa getPessoa(int indiceLinha){
        return linhas.get(indiceLinha);
    }
    
    public void addPessoa(Hacker p){
        linhas.add(p);
        int ultimoIndice = getRowCount()-1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
    public void remove(int indiceLinha){
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
   
    public void addLista(List<Hacker> f){
        // pega o tamanho antigo da tabela
        int tamanhoAntigo = getRowCount();
        
        //adiciona registros
        linhas.addAll(f);
        fireTableRowsInserted(tamanhoAntigo, getRowCount()-1);
    }
    
    public void limpar(){
        linhas.clear();
        fireTableDataChanged();
    }
    
    public boolean isEmpty(){
        return linhas.isEmpty();
    }
    
    public void atualizaTabela(){
        this.fireTableDataChanged();
    }
    
    
}