package api.trivia.controller;

import api.trivia.dto.QuestionRequestDTO;
import api.trivia.dto.QuestionResponseDTO;
import api.trivia.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/questions")
@Tag(name = "Halloween Trivia Questions", description = "API to manage Halloween trivia questions 👻")
public class QuestionController {

    private final QuestionService questionService;
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Operation(summary = "Add a new question 👻")
    @PostMapping
    public QuestionResponseDTO addQuestion(@RequestBody QuestionRequestDTO questionDTO) {
        return questionService.addQuestion(questionDTO);
    }

    @Operation(summary = "List all questions \uFE0F")
    @GetMapping
    public List<QuestionResponseDTO> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @Operation(summary = "Update an existing question \uD83C\uDF83")
    @PutMapping("/{id}")
    public QuestionResponseDTO updateQuestion(
            @PathVariable Long id,
            @RequestBody QuestionRequestDTO questionDTO) {
        return questionService.updateQuestion(id, questionDTO);
    }

    @Operation(summary = "Get random questions by difficulty \uD83D\uDD78\uFE0F")
    @GetMapping("/random/{difficulty}")
    public List<QuestionResponseDTO> getRandomQuestions(@PathVariable String difficulty) {
        return questionService.getRandomQuestionsByDifficulty(difficulty);
    }
}