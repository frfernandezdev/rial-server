package com.rial.shared.domain.valueobject;

import java.util.Objects;
import java.util.UUID;

public class UuidValueObject {
    private final String value;

    public UuidValueObject(String value) {
        ensureValidUuid(value);
        this.value = value;
    }

    public String value() { return value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UuidValueObject)) {
            return false;
        }
        UuidValueObject that = (UuidValueObject) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    private void ensureValidUuid(String value) throws IllegalArgumentException {
        UUID.fromString(value);
    }
}
