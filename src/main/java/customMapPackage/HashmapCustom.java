package customMapPackage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class HashmapCustom
{
    static class HashMap<K, V>
    {
        private class Node
        {
            K key;
            V value;

            public Node(K key, V value)
            {
                this.key = key;
                this.value = value;
            }
        }

        private int totalNodes; //Total no of nodes
        private int totalBuckets; //Total no of buckets
        private LinkedList<Node> buckets[];

//        private ReentrantLock[] bucketLocks; //lock for each bucket

        @SuppressWarnings("unchecked")
        public HashMap()
        {
            this.totalBuckets = 4;
            this.buckets = new LinkedList[4];

            for(int i=0; i<totalBuckets; i++)
            {
                this.buckets[i] = new LinkedList<>(); //bucketLocks[i] = new ReentrantLock();
            }
        }

        private int searchInLL(K key, int buckIdx)
        {
            LinkedList<Node> ll = buckets[buckIdx];

            for(int i=0; i<ll.size(); i++)
            {
                if(ll.get(i).key.equals(key)) return i;
            }
            return -1;
        }

        public boolean isEmpty()
        {
            return totalNodes == 0;
        }
        private int hashKode(K key)
        {
            return Math.abs((key.hashCode() % totalBuckets));
        }

        public ArrayList<K> keySet()
        {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++)
            {
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++)
                {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public void put(K key, V value)
        {
            int buckIdx = hashKode(key);
            int dataIdx = searchInLL(key, buckIdx);

            /*
            ReentrantReadWriteLock lock = bucketLocks[buckIdx];
            try
            {
                lock.writeLock().lock();
                //operations
            }
            finally
            {
                lock.writeLock().unlock();
            }
            * */

            /*
                // LinkedHashmap MODIFICATION
            if(dataIdx != -1) //key exists, update val
            {
                buckets[buckIdx].get(dataIdx).value = value;
                return;
            }

            Node newNode = new Node(key, value);

            //Maintain insertion order
            if(buckets[buckIdx].isEmpty())
            {
                //First element, add directly
                buckets[buckIdx].add(newNode);
            }
            else
            {
                //Add at first position for maintaining insertion order
                buckets[buckIdx].addFirst(newNode);
            }
            totalNodes++;
            */

            if(dataIdx == -1)   //key doesn't exist
            {
                buckets[buckIdx].add(new Node(key, value));
                totalNodes++;
            }
            else    //key exists
            {
                Node node = buckets[buckIdx].get(dataIdx);
                node.value = value;
            }

            // load factor
            double lambda = totalNodes/totalBuckets;

            if(lambda > 2.0)
            {
                //rehashing
                rehash();
            }
        }


        public boolean containsKey(K key)
        {
            int buckIdx = hashKode(key);
            int dataIdx = searchInLL(key, buckIdx);

            if(dataIdx == -1)   //key doesn't exist
            {
                return false;
            }
            return true;
        }

        public V get(K key)
        {
            int buckIdx = hashKode(key);
            int dataIdx = searchInLL(key, buckIdx);

            /*
            ReentrantReadWriteLock lock = bucketLocks[buckIdx];
            try
            {
                lock.readLock().lock();
                //operations
            }
            finally
            {
                lock.readLock().unlock();
            }
            */

            if(dataIdx == -1)   //key doesn't exist
            {
                return null;
            }
            else    //key exists
            {
                Node node = buckets[buckIdx].get(dataIdx);
                return node.value;
            }
        }

        public V remove(K key)
        {
            int buckIdx = hashKode(key);
            int dataIdx = searchInLL(key, buckIdx);

            if(dataIdx == -1)   //key doesn't exist
            {
                return null;
            }
            else    //key exists
            {
                Node node = buckets[buckIdx].remove(dataIdx);
                totalNodes--;
                return node.value;
            }
        }


        @SuppressWarnings("unchecked")
        private void rehash()
        {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[totalBuckets * 2];

            //To create empty linkedlist in buckets
            for(int i=0; i<totalBuckets*2; i++)
            {
                buckets[i] = new LinkedList<>();
            }
            for(int i=0; i<oldBuckets.length; i++)
            {
                LinkedList<Node> ll = oldBuckets[i];
                for(int j=0; j<ll.size(); j++)
                {
                    Node node = ll.get(i);
                    put(node.key, node.value);
                }
            }
        }
    }
}
