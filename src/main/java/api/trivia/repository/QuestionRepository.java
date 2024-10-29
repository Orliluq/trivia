package api.trivia.repository;

import api.trivia.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import api.trivia.model.Difficulty;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByDifficulty(Difficulty difficulty);
}
