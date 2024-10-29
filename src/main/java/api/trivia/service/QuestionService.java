package api.trivia.service;

import api.trivia.dto.QuestionRequestDTO;
import api.trivia.dto.QuestionResponseDTO;
import api.trivia.exception.ResourceNotFoundException;
import api.trivia.model.Difficulty;
import api.trivia.model.Question;
import api.trivia.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
    public QuestionResponseDTO addQuestion(QuestionRequestDTO questionDTO) {
        Question question = new Question();
        question.setQuestion(questionDTO.getQuestion());
        question.setAnswer(questionDTO.getAnswer());
        question.setDifficulty(Difficulty.fromString(questionDTO.getDifficulty()));
        question = questionRepository.save(question);
        return toResponseDTO(question);
    }
    public List<QuestionResponseDTO> getAllQuestions() {
        return questionRepository.findAll()
                .stream()
                .map(this::toResponseDTO)
                .toList(); // Use modern toList()
    }

    public List<QuestionResponseDTO> getRandomQuestionsByDifficulty(String difficulty) {

        Difficulty difficultyEnum = Difficulty.fromString(difficulty);
        List<Question> questionsByDifficulty = questionRepository.findByDifficulty(difficultyEnum);
        return questionsByDifficulty.stream()
                .map(this::toResponseDTO)
                .toList();
    }
    public QuestionResponseDTO updateQuestion(Long id, QuestionRequestDTO questionDTO) {
        Question existingQuestion = questionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pregunta no encontrada"));

        existingQuestion.setQuestion(questionDTO.getQuestion());
        existingQuestion.setAnswer(questionDTO.getAnswer());

        // Use the fromString method correctly
        existingQuestion.setDifficulty(Difficulty.fromString(questionDTO.getDifficulty()));

        Question updatedQuestion = questionRepository.save(existingQuestion);
        return toResponseDTO(updatedQuestion);
    }

    private QuestionResponseDTO toResponseDTO(Question question) {
        QuestionResponseDTO dto = new QuestionResponseDTO();
        dto.setId(question.getId());
        dto.setQuestion(question.getQuestion());
        dto.setAnswer(question.getAnswer());
        dto.setDifficulty(question.getDifficulty().toValue());
        return dto;
    }
}