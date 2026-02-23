package tn.esprit.youssefalaya_4arctic10.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

public enum CallStatus {
    ON_HOLD,
    IN_PROGRESS,
    TRANSFERRED,
    RESOLVED,
    ABANDONED
}