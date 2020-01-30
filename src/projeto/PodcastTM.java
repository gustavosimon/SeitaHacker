package projeto;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * Classe para manipular a tabela de Podcast - Fonte adaptado a partir do disponibilizado pelo professor
 * @author dalalana
 */
public class PodcastTM extends AbstractTableModel {
    
    private List<Podcast> linhas;
    private String[] colunas = new String[]{"Titulo","Responsável","Link do Youtube"};

    public PodcastTM(){
        linhas = new ArrayList<Podcast>();
        
    }
    public PodcastTM(List<Podcast> lista) {
        this.linhas = new ArrayList<Podcast>(lista);
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
        Podcast p = linhas.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getTitulo();
            
            case 1:
                return p.getResponsavel().getNome();
               
            case 2:
                return p.getLink();
                
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Podcast p = linhas.get(rowIndex); // carrega o item da linha a ser modificado
        switch(columnIndex){
            case 0:
                p.setTitulo(aValue.toString());
                break;
            
            case 1:
                p.getResponsavel().setNome(aValue.toString());
                break;
               
            case 2:
                p.setLink(aValue.toString());
                break;
                
            default:
                
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    
    public void setValueAt(Podcast aValue, int rowIndex) {
        Podcast p = linhas.get(rowIndex); // carrega o item da linha a ser modificado
        
        p.setTitulo(aValue.getTitulo());
        p.setResponsavel(aValue.getResponsavel());
        p.setLink(aValue.getLink());
       
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    public Podcast getPodcast(int indiceLinha){
        return linhas.get(indiceLinha);
    }
    
    public void addPodcast(Podcast p){
        linhas.add(p);
        int ultimoIndice = getRowCount()-1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
    public void remove(int indiceLinha){
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
   
    public void addLista(List<Podcast> f){
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