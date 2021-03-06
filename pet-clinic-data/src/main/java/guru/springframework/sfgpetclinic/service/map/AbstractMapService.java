package guru.springframework.sfgpetclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

	protected Map<ID, T> map = new HashMap<>();

	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	public T findById(ID id) {
		return map.get(id);
	}

	public T save(ID id, T entity) {
		return map.put(id, entity);
	}

	public void delete(T entity) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(entity));
	}

	public void deleteById(ID id) {
		map.remove(id);
	}

}
