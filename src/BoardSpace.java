
public class BoardSpace 
	{
	String display;
	boolean visible;
	boolean paired; 
	String word; 
	int row; 
	int col; 
	
		
		public BoardSpace(String w, String x, boolean v, boolean p, int r, int c)
			{
			word = w; 
			visible = v;
			paired = p; 
			display = x; 
			row = r; 
			col = c; 
			}
		
		public int getRow() {
			return row;
		}

		public void setRow(int row) {
			this.row = row;
		}

		public int getCol() {
			return col;
		}

		public void setCol(int col) {
			this.col = col;
		}

		public String getDisplay() {
			return display;
		}

		public void setDisplay(String display) {
			this.display = display;
		}

		public boolean isVisible() {
			return visible;
		}

		public void setVisible(boolean visible) {
			this.visible = visible;
		}

		public boolean isPaired() {
			return paired;
		}

		public void setPaired(boolean paired) {
			this.paired = paired;
		}

		public String getWord() {
			return word;
		}

		public void setWord(String word) {
			this.word = word;
		}

		
		
	}
