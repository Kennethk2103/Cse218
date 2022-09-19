public class Node {
        //instance variable of Node class
        public int data;
        public Node left;
        public Node right;

        //constructor
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // instance variable
    public Node root;

    // constructor for initialise the root to null BYDEFAULT
    public BinarySearchTree() {
        this.root = null;
    }

    // insert method to insert the new Date
    public void insert(int newData) {
        this.root = insert(root, newData);
    }

    public Node insert(Node root, int newData) {
        // Base Case: root is null or not
        if (root == null) {
            // Insert the new data, if root is null.
            root = new Node(newData);
            // return the current root to his sub tree
            return root;
        }
        // Here checking for root data is greater or equal to newData or not
        else if (root.data >= newData) {
            // if current root data is greater than the new data then now process the left sub-tree
            root.left = insert(root.left, newData);
        } else {
            // if current root data is less than the new data then now process the right sub-tree
            root.right = insert(root.right, newData);
        }
        return root;
    }

    // method for search the data , is data is present or not in the tree ?
    public boolean search(int data) {
        return search(this.root, data);
    }

    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return search(root.left, data);
        }
        return search(root.right, data);
    }

    //Traversal
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // Creating the object of BinarySearchTree class
        BinarySearchTree bst = new BinarySearchTree();
        // call the method insert
        bst.insert(8);
        bst.insert(5);
        bst.insert(9);
        bst.insert(3);
        bst.insert(7);
        bst.preorder();
        System.out.println(bst.search(7));
        
    }
    public void deleteANode(Node node) {
        deleteNode(this.root, node);
    }

    private Node deleteNode(Node root, Node node) {
        // check for node initially
        if (root == null) {
            return null;
        } else if (node.data < root.data) {
            // process the left sub tree
            root.left = deleteNode(root.left, node);
        } else if (node.data > root.data) {
            // process the right sub tree
            root.right = deleteNode(root.right, node);
        } else if(root.data==node.data){
            // case 3: 2 child
            if (root.left != null && root.right != null) {
                int lmax = findMaxData(root.left);
                root.data = lmax;
                root.left = deleteNode(root.left, new Node(lmax));
                return root;
            }
            //case 2: one child
            // case i-> has only left child
            else if (root.left != null) {
                return root.left;
            }
            // case ii-> has only right child
            else if (root.right != null) {
                return root.right;
            }
            //case 1:- no child
            else {
                return null;
            }
        }
        return root;
    }
}
//public void insert(Node node, int value)   
//{  
//    if (value < node.value)   
//    {  
//        if (node.left != null)   
//        {  
//            insert(node.left, value);  
//        } else   
//        {  
//            System.out.println("  Inserted " + value + " to left of Node " + node.value);  
//            node.left = new Node(value);  
//        }  
//    }   
//    else if (value > node.value)   
//    {  
//        if (node.right != null)   
//        {  
//            insert(node.right, value);  
//        } else   
//        {  
//            System.out.println("  Inserted " + value + " to right of Node " + node.value);  
//            node.right = new Node(value);  
//        }  
//    }  
//}  
//1) Preorder - This traversal involves printing the root, then recursively calling the function for the left subtree and the right subtree. 
//
//2) Postorder - This traversal involves recursively calling the function for the left subtree and the right subtree and then printing the root. 
//
//3) Inorder - This traversal involves recursively calling the function for the left subtree, printing the root, and then recursively calling the function for the right subtree.