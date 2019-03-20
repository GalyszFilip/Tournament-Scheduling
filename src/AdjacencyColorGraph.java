import java.util.HashMap;
import java.util.Map;

public class AdjacencyColorGraph<Vertex, Edge> extends AdjacencyGraph<Vertex, Edge>
		implements ColorGraph<Vertex, Edge> {
	public int colorVertices() {
		int nuberOfColors = 0;

		Map<Vertex, Integer> lista = new HashMap<Vertex, Integer>();
		for (Vertex v : getVertices())
			lista.put(v, -1);

		for (Vertex v : getVertices())
			lista.replace(v, -1, 0);

		String[] tablica = new String[vertexToEdges.size()];

		System.out.println(vertexToEdges.keySet());
		for (Vertex v : getVertices()) {
			vertexToEdges.get(v).size();
		}

		return nuberOfColors;
	}

	public int getColor(Vertex v) {
		return 0;
	}
}
