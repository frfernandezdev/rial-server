package com.rial.shared.domain.criteria.valueobject;

import java.util.Objects;
import java.util.UUID;

public class UuidValueObject {
    private final UUID value;

    public UuidValueObject(String value) {
        this.value = UUID.fromString(value);
    }

    public UUID value() { return value; }

    @Override
    public String toString() { return this.value.toString(); }

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

}
