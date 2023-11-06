package delacasa_sms;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
/**
 * @author Angelica DC
 */
public class StudentIdComparator implements Comparator{
    private DefaultTableModel tableModel;

    public StudentIdComparator(DefaultTableModel model) {
        this.tableModel = model;
    }

    @Override
    public int compare(Object row1, Object row2) {
        String id1 = (String) tableModel.getValueAt((int) row1, 0);
        String id2 = (String) tableModel.getValueAt((int) row2, 0);
        return id1.compareTo(id2);
    }
}
