class exp8 {
    class Pair implements Comparable<Pair> {
        int edge, weight;

        Pair(int edge, int weight) {
            this.edge = edge;
            this.weight = weight;
        }

        @Override
        public int compareTo(Pair other) {
            return this.weight - other.weight;
        }

    }

    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        List<List<Pair>> adlist = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adlist.add(new ArrayList<Pair>());
        }
        for (int i[] : edges) {
            adlist.get(i[0]).add(new Pair(i[1], i[2]));
            adlist.get(i[1]).add(new Pair(i[0], i[2]));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        int[] res = new int[V];
        Arrays.fill(res, (int) 1e9);

        res[src] = 0;
        pq.add(new Pair(src, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            for (Pair i : adlist.get(curr.edge))
                if (res[curr.edge] + i.weight < res[i.edge]) {
                    res[i.edge] = res[curr.edge] + i.weight;
                    pq.add(new Pair(i.edge, res[i.edge]));
                }
        }
        return res;
    }
}