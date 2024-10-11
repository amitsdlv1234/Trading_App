package com.AK_JAVA.Trading.App.Model;


import com.AK_JAVA.Trading.App.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {
    private boolean isEnabled =false;
    private VerificationType sendTo;
}
