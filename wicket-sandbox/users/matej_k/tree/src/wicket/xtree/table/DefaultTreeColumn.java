package wicket.xtree.table;

import wicket.Component;
import wicket.MarkupContainer;
import wicket.markup.html.basic.Label;

public class DefaultTreeColumn extends AbstractTreeColumn {

	public DefaultTreeColumn(ColumnLocation location, String header)
	{
		this.location = location;
		this.header = header;
	}
	
	private ColumnLocation location;
	private String header;
	private boolean visible = true;
	
	public Component createHeader(MarkupContainer<?> parent, String id) {
		return new Label(parent, id, header);
	}

	public ColumnLocation getLocation() {
		return location;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
