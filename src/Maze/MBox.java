package Maze;
import java.io.PrintWriter;

public abstract class MBox
{
		private final int line;
		private final int column;
		private final Maze maze;
		public MBox(Maze maze, int line, int column)
		{
			this.line=line;
			this.column=column;
			this.maze=maze;
		}
		public String getLabel()
		{
			return "("+ line + ","+column+")";
		}
		public int getLine()
		{
			return line;
		}
		public int getColumn()
		{
			return column;
		}
		public boolean isAccessible()
		{
			return true;
		}
		public abstract void writeCharTo(PrintWriter pw);
	}
