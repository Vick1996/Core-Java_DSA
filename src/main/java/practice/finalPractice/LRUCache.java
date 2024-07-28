package practice.finalPractice;

import java.util.HashMap;

class Node
{
    Node prev, next;
    int key, val;

    Node(int key, int val)
    {
        this.key = key;
        this.val = val;
    }
}
public class LRUCache
{
    Node first = new Node(-1,-1);
    Node last = new Node(-1, -1);
    int capacity;

    HashMap<Integer, Node> hm = new HashMap<>();

    public LRUCache(int cap)
    {
        capacity = cap;
        first.next = last;
        last.prev = first;
    }

    public void get(int key)
    {
        int res = -1;
        Node n = hm.get(key);

        if(n != null)
        {
            res = n.val;
            remove(n);
            add(n);
        }
        System.out.println(res);
    }
    public void remove(Node n)
    {
        if(n==first.next && n==last.prev)
        {
            first.next = last;
            last.prev = first;
        }
        else
        {
            Node nnxt = n.next;
            Node nprev = n.prev;

            nprev.next = nnxt;
            nnxt.prev = nprev;
        }
    }

    public void add(Node n)
    {
        Node hnxt = first.next;
        first.next = n;
        n.prev = first;
        n.next = hnxt;
        hnxt.prev = n;
    }

    public void put(int key, int val)
    {
        Node n = hm.get(key);

        if(n != null)
        {
            remove(n);
            n.val = val;
            add(n);
        }
        else
        {
            if(hm.size() == capacity)
            {
                hm.remove(last.prev.key);
                remove(last.prev);
            }
            Node nn = new Node(key, val);
            add(nn);
            hm.put(key, nn);
        }
    }

    public static void main(String[] args)
    {
        LRUCache lru = new LRUCache(4);
        lru.put(1, 1); // cache is {1=1}
        lru.put(2, 2); // cache is {1=1, 2=2}
        lru.get(1);    // return 1
        lru.put(3, 3);
    }
}
