package aufgabe_6;

class Node{
	String content;
	Node leftNode = null;
	Node rightNode = null;
	
	public Node(String content)
	{
		this.content = content;
	}
	
	public void setRight(Node rightNode)
	{
		this.rightNode = rightNode;
	}
	
	public void setLeft(Node leftNode)
	{
		this.leftNode = leftNode;
	}
	
	public Node getRight()
	{
		return rightNode;
	}
	
	public Node getLeft()
	{
		return leftNode;
	}
	
	public boolean hasLeft()
	{
		if(leftNode != null) return true;
		return false;
	}
	
	public boolean hasRight()
	{
		if(rightNode != null) return true;
		return false;
	}
}

class BinaryTree
{
	Node root = null;
	
	
	//node hinzufügen
	public void add(String content)
	{
		root = addRecursive(root, content);
	}
	//node löschen
	public void delete(String content)
	{
			root = deleteRecursive(root, content);
	}
	//existiert eine node?
	public boolean contains(String content)
	{
		return contains(root, content);
	}
	
	public void printTree()
	{
		inOrder(root);
		System.out.println();
	}
	
	private Node addRecursive (Node current, String content)
	{
		if(current == null)
		{
			return new Node(content);
		}
		
		//Der Baum soll schon sortiert werden also muss das nach Wert
		//kleinere Wort nach links und das größere nach rechts
		//Sollte es den Wert so schon geben, dann würde das Wort bereits existieren
		
		
		if(content.compareTo(current.content) < 0)
		{
			current.setLeft(addRecursive(current.getLeft(), content));
		}
		
		else if(content.compareTo(current.content) > 0)
		{
			current.setRight(addRecursive(current.getRight(), content));
		}
		
		else
		{
			return current;
		}
		
		return current;
	}
	
	private boolean contains(Node current, String content)
	{
		if(current == null) return false;
		else if(current.content.equals(content)) return true;
		else if(current.content.compareTo(content) > 0)
		{
			return contains(current.getLeft(), content);	
		}
		else 
		{
			return contains(current.getRight(), content);
		}
	}
	
	private Node deleteRecursive(Node current, String content)
	{
		/*Es gibt mehrere Fälle bei denen man immer anders Handeln muss..
		 * Fall 1: Die Node hat keine Kinder (nix left, nix right)
		 * Fall 2: Die Node hat nur ein Kind links oder rechts
		 * Fall 3: Die Node hat zwei Kinder, links und rechts
		 */
		
		
		//Wir haben den content nicht gefunden
		if(current == null) return null;
		
		//wir haben den content gefunden, dieses Element müssen wir löschen
		else if(current.content.equals(content))
		{
			//Fall 1: Man muss die Node mit null ersetzen, ist ja die letzte in der Kette.
			if(!current.hasLeft() && !current.hasRight())
			{
				return null;
			}
			
			//Fall 2: Die Node muss den Wert des Kindes annehmen
			
			else if(current.hasRight())
			{
				return current = current.getRight();
			}
			
			else if(current.hasLeft())
			{
				return current = current.getLeft();
			}
			
			//Fall 3: Man ersetzt current mit der kleinsten Node des rechten Teil Baums.. Dann passt das wieder mit der Sortierung
			//Dafür schreibe ich die Methode findSmallestNode(Node current) mit der ich die kleinste Node des Teilbaums finde
			else 
			{
				//Ich suche hiermit den kleinsten Teil des rechten Baumes.
				Node smallest = findSmallestNode(current.getRight());
				current.content = smallest.content;
				current.rightNode = deleteRecursive(current.getRight(), smallest.content);
				return current;
			}
		}
		//Content sollte links im baum sein
		else if(content.compareTo(current.content) < 0)
		{
			current.leftNode = deleteRecursive(current.leftNode, content);
			return current;
		}
		//Content sollte rechts im baum sein
		else
		{
			current.rightNode = deleteRecursive(current.rightNode, content);
			return current;
		}
		
	}
	
	private Node findSmallestNode(Node current)
	{
		if(current.hasLeft())
		{
			return findSmallestNode(current.getLeft());
		}
		else return current;
	}
	
	private Node inOrder(Node current)
	{
		if(current != null)
		{
			inOrder(current.leftNode);
			System.out.print(current.content + " ");
			inOrder(current.rightNode);
		}
		return null;
	}
}
public class Aufgabe_6_4 {
	public static void main(String[] args)
	{
		BinaryTree bt = new BinaryTree();
		
		bt.add("Anna");
		bt.add("Peter");
		bt.add("Niklas");
		
		System.out.println(bt.contains("Niklas"));
		System.out.println(bt.contains("Peter"));
		System.out.println(bt.contains("Anna"));
		bt.printTree();
		bt.delete("Niklas");
		System.out.println(bt.contains("Niklas"));
		System.out.println(bt.contains("Peter"));
		System.out.println(bt.contains("Anna"));
		bt.add("Britta");
		bt.printTree();
	}
}
