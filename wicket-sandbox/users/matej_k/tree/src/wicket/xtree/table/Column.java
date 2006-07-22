package wicket.xtree.table;

import java.io.Serializable;

import javax.swing.tree.TreeNode;

import wicket.Component;
import wicket.MarkupContainer;

public interface Column extends Serializable {

	public ColumnLocation getLocation();
	
	public boolean isVisible();
	
	public Component createHeader(MarkupContainer<?> parent, String id);	 
	
	public Component createCell(MarkupContainer<?> parent, String id, TreeNode node, int level);	
}
