package ObserverPattern;

import java.util.Map;
import java.time.LocalDateTime;

public interface PhysicalItemObserver {
	void update(String bookTitle, LocalDateTime dueDate);
}
