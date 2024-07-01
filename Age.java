class Age {
  private int birthyear;
  private int age;

  public int getBirthyear() {
    return birthyear;
  }

  public void setBirthyear(int birthyear) {
    this.birthyear = birthyear;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void calAge(int birthyear) {
    this.age = 2024 - birthyear + 1;
  }

}